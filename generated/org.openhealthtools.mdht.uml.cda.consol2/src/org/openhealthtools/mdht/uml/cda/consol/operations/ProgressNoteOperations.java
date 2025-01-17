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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteInterventionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteObjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteSubjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility1 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getInterventionsSection() <em>Get Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getObjectiveSection() <em>Get Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getSubjectiveSection() <em>Get Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressNoteOperations extends GeneralHeaderConstraintsOperations {
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
	protected ProgressNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS,
						ConsolPlugin.INSTANCE.getString(
							"ProgressNoteProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProgressNoteProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			"ERROR");

		if (VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT,
						ConsolPlugin.INSTANCE.getString(
							"ProgressNoteProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCodeP(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCodeP(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCodeP(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteGeneralHeaderConstraintsCodeP", "ERROR");

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE_P,
						ConsolPlugin.INSTANCE.getString("ProgressNoteGeneralHeaderConstraintsCodeP"),
						new Object[] { progressNote }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
				}
				passToken.add(progressNote);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteDocumentationOf(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteDocumentationOf", "WARNING");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteDocumentationOf"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOf(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteComponentOf(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteComponentOf", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteComponentOf"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAssessmentSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAssessmentSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteAssessmentSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteAssessmentSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ASSESSMENT_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteAssessmentSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNotePlanOfCareSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePlanOfCareSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNotePlanOfCareSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePlanOfCareSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNotePlanOfCareSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNotePlanOfCareSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PLAN_OF_CARE_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNotePlanOfCareSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAssessmentAndPlanSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentAndPlanSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAssessmentAndPlanSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentAndPlanSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteAssessmentAndPlanSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteAssessmentAndPlanSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteAssessmentAndPlanSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAllergiesSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAllergiesSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAllergiesSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Allergies Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAllergiesSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteAllergiesSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteAllergiesSectionEntriesOptional", "INFO");

		if (VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteAllergiesSectionEntriesOptional"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteChiefComplaintSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteChiefComplaintSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteChiefComplaintSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteInterventionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Interventions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteInterventionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteInterventionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Interventions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteInterventionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteInterventionsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteInterventionsSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_INTERVENTIONS_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteInterventionsSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteMedicationsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteMedicationsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteMedicationsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteMedicationsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteMedicationsSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteMedicationsSectionEntriesOptional", "INFO");

		if (VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteMedicationsSectionEntriesOptional"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteObjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteObjectiveSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_OBJECTIVE_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteObjectiveSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNotePhysicalExamSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePhysicalExamSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNotePhysicalExamSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Exam Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePhysicalExamSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNotePhysicalExamSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNotePhysicalExamSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PHYSICAL_EXAM_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNotePhysicalExamSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteProblemSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteProblemSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteProblemSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteProblemSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteProblemSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteProblemSectionEntriesOptional", "INFO");

		if (VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteProblemSectionEntriesOptional"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteResultsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteResultsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteResultsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteResultsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteResultsSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteResultsSectionEntriesOptional", "INFO");

		if (VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteResultsSectionEntriesOptional"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteReviewOfSystemsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteReviewOfSystemsSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteReviewOfSystemsSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteSubjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteSubjectiveSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_SUBJECTIVE_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteSubjectiveSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteVitalSignsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteVitalSignsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteVitalSignsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteVitalSignsSectionEntriesOptional(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteVitalSignsSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteVitalSignsSectionEntriesOptional", "INFO");

		if (VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteVitalSignsSectionEntriesOptional"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteInstructionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteInstructionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteInstructionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Instructions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteInstructionsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNoteInstructionsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteInstructionsSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_INSTRUCTIONS_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteInstructionsSection"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(effectiveTime->forAll(not low.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow", "WARNING");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(effectiveTime->forAll(width.oclIsUndefined() implies not high.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 8) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 8))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2PreciseToTheDay", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2PreciseToTheDay"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 12) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 12))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Minute</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute", "WARNING");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() >= 14) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() >= 14))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond", "INFO");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 If More Precise Than Day Include Time Zone Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((not effectiveTime.low.value.oclIsUndefined() and effectiveTime.low.value.size() > 8 implies effectiveTime.low.value.size() >= 15) and (not effectiveTime.high.value.oclIsUndefined() and effectiveTime.high.value.size() > 8 implies effectiveTime.high.value.size() >= 15))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 If More Precise Than Day Include Time Zone Offset</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset",
			"WARNING");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2TemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2TemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.3.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2TemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2TemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2TemplateId(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2TemplateId", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2TemplateId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2ClassCode", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2ClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2EffectiveTime", "WARNING");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteDocumentationOfServiceEvent2EffectiveTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteDocumentationOfServiceEvent2(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteDocumentationOfServiceEvent2(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteDocumentationOfServiceEvent2", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2,
							ConsolPlugin.INSTANCE.getString("ProgressNoteProgressNoteDocumentationOfServiceEvent2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility1 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null).healthCareFacility->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() =  1))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility1 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null)->reject(healthCareFacility->one(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 8)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 12)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Minute</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute", "WARNING");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 14)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond", "INFO");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 If More Precise Than Day Include Time Zone Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() and effectiveTime.value.size() > 8 implies effectiveTime.value.size() >= 15)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 If More Precise Than Day Include Time Zone Offset</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProgressNoteProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset",
			"WARNING");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6EffectiveTime", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6EffectiveTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6Id", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6Id"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6Location", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6Location"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteProgressNoteComponentOfEncompassingEncounter6", "ERROR");

		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNoteProgressNoteComponentOfEncompassingEncounter6"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(ProgressNote) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(ProgressNote) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentSection getAssessmentSection(ProgressNote progressNote) {

		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(368));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(ProgressNote) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(ProgressNote) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfCareSection getPlanOfCareSection(ProgressNote progressNote) {

		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(369));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ProgressNote) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection(ProgressNote) <em>Get Assessment And Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection getAssessmentAndPlanSection(ProgressNote progressNote) {

		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(370));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(
					GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(ProgressNote) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(ProgressNote) <em>Get Allergies Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(ProgressNote progressNote) {

		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(371));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(
					GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(ProgressNote) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(ProgressNote) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(ProgressNote progressNote) {

		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(372));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionsSection(ProgressNote) <em>Get Interventions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))->asSequence()->any(true).oclAsType(consol::InterventionsSection)";

	/**
	 * The cached OCL query for the '{@link #getInterventionsSection(ProgressNote) <em>Get Interventions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InterventionsSection getInterventionsSection(ProgressNote progressNote) {

		if (GET_INTERVENTIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(373));
			try {
				GET_INTERVENTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INTERVENTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INTERVENTIONS_SECTION__EOCL_QRY);
		return (InterventionsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional(ProgressNote) <em>Get Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::MedicationsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional(ProgressNote) <em>Get Medications Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional(ProgressNote progressNote) {

		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(374));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(
					GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (MedicationsSectionEntriesOptional) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getObjectiveSection(ProgressNote) <em>Get Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))->asSequence()->any(true).oclAsType(consol::ObjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getObjectiveSection(ProgressNote) <em>Get Objective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ObjectiveSection getObjectiveSection(ProgressNote progressNote) {

		if (GET_OBJECTIVE_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(375));
			try {
				GET_OBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_OBJECTIVE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_OBJECTIVE_SECTION__EOCL_QRY);
		return (ObjectiveSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection(ProgressNote) <em>Get Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection(ProgressNote) <em>Get Physical Exam Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PhysicalExamSection getPhysicalExamSection(ProgressNote progressNote) {

		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(376));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(ProgressNote) <em>Get Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProblemSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional(ProgressNote) <em>Get Problem Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSectionEntriesOptional getProblemSectionEntriesOptional(ProgressNote progressNote) {

		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(377));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(
					GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSectionEntriesOptional(ProgressNote) <em>Get Results Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ResultsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getResultsSectionEntriesOptional(ProgressNote) <em>Get Results Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSectionEntriesOptional getResultsSectionEntriesOptional(ProgressNote progressNote) {

		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(378));
			try {
				GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(
					GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ResultsSectionEntriesOptional) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ProgressNote) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ProgressNote) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReviewOfSystemsSection getReviewOfSystemsSection(ProgressNote progressNote) {

		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(379));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectiveSection(ProgressNote) <em>Get Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))->asSequence()->any(true).oclAsType(consol::SubjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getSubjectiveSection(ProgressNote) <em>Get Subjective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SubjectiveSection getSubjectiveSection(ProgressNote progressNote) {

		if (GET_SUBJECTIVE_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(380));
			try {
				GET_SUBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_SUBJECTIVE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUBJECTIVE_SECTION__EOCL_QRY);
		return (SubjectiveSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(ProgressNote) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(ProgressNote) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(ProgressNote progressNote) {

		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(381));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(
					GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructionsSection(ProgressNote) <em>Get Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))->asSequence()->any(true).oclAsType(consol::InstructionsSection)";

	/**
	 * The cached OCL query for the '{@link #getInstructionsSection(ProgressNote) <em>Get Instructions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InstructionsSection getInstructionsSection(ProgressNote progressNote) {

		if (GET_INSTRUCTIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE,
				ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(382));
			try {
				GET_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (InstructionsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNoteGeneralHeaderConstraintsTemplateId", "ERROR");

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ProgressNoteGeneralHeaderConstraintsTemplateId"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11506-3' or value.code = '18733-6' or value.code = '18762-5' or value.code = '28569-2' or value.code = '28617-9' or value.code = '34900-1' or value.code = '34904-3' or value.code = '18764-1' or value.code = '28623-7' or value.code = '11507-1' or value.code = '11508-9' or value.code = '11509-7' or value.code = '28627-8' or value.code = '11510-5' or value.code = '28656-7' or value.code = '11512-1' or value.code = '34126-3' or value.code = '15507-7' or value.code = '34129-7' or value.code = '34125-5' or value.code = '34130-5' or value.code = '34131-3' or value.code = '34124-8' or value.code = '34127-1' or value.code = '34128-9' or value.code = '34901-9' or value.code = '34132-1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCode(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(progressNote)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProgressNoteGeneralHeaderConstraintsCode", "ERROR");

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE,
						ConsolPlugin.INSTANCE.getString("ProgressNoteGeneralHeaderConstraintsCode"),
						new Object[] { progressNote }));
			}

			return false;
		}
		return true;
	}

} // ProgressNoteOperations
