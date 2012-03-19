/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Template Id</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility1 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressNoteOperations extends GeneralHeaderConstraintsOperations {
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.9')
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTemplateId(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteTemplateId"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteDocumentationOf(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteDocumentationOf"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteComponentOf(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteComponentOf"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteAssessmentSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ASSESSMENT_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteAssessmentSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNotePlanOfCareSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PLAN_OF_CARE_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNotePlanOfCareSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteAssessmentAndPlanSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteAssessmentAndPlanSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteAllergiesSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteAllergiesSectionEntriesOptional"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteChiefComplaintSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteChiefComplaintSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteInterventionsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_INTERVENTIONS_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteInterventionsSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteMedicationsSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteMedicationsSectionEntriesOptional"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteObjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_OBJECTIVE_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteObjectiveSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNotePhysicalExamSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PHYSICAL_EXAM_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNotePhysicalExamSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteProblemSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteProblemSectionEntriesOptional"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteResultsSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteResultsSectionEntriesOptional"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteReviewOfSystemsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteReviewOfSystemsSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteSubjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_SUBJECTIVE_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteSubjectiveSection"),
						 new Object [] { progressNote }));
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
	protected static Constraint VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteVitalSignsSectionEntriesOptional(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteVitalSignsSectionEntriesOptional"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR) else true endif
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteDocumentationOfServiceEvent2ClassCode(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteDocumentationOfServiceEvent2ClassCode"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) and self.documentationOf.serviceEvent->exists(not oclIsUndefined()) then self.documentationOf.serviceEvent->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteDocumentationOfServiceEvent2EffectiveTime"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.documentationOf->exists(not oclIsUndefined()) then self.documentationOf->forAll(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent))) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteDocumentationOfServiceEvent2(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteDocumentationOfServiceEvent2(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.documentationOf->exists(not oclIsUndefined()) then self.documentationOf->forAll(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent))) else true endif
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteDocumentationOfServiceEvent2(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteDocumentationOfServiceEvent2"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter.location->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter.location.healthCareFacility->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter.location.healthCareFacility->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1)) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility1 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter.location->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter.location.healthCareFacility->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter.location.healthCareFacility->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1)) else true endif
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
			ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteComponentOfEncompassingEncounter6EffectiveTime"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6Id(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteComponentOfEncompassingEncounter6Id"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location))) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location))) else true endif
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteComponentOfEncompassingEncounter6Location(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION,
						 ConsolPlugin.INSTANCE.getString("ProgressNoteComponentOfEncompassingEncounter6Location"),
						 new Object [] { progressNote }));
			}
			return false;
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
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->first().oclAsType(consol::AssessmentSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->first().oclAsType(consol::AssessmentSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AssessmentSection getAssessmentSection(ProgressNote progressNote) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(177));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
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
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanOfCareSection(ProgressNote progressNote) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(178));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
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
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->first().oclAsType(consol::AssessmentAndPlanSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->first().oclAsType(consol::AssessmentAndPlanSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AssessmentAndPlanSection getAssessmentAndPlanSection(ProgressNote progressNote) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(179));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
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
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(ProgressNote progressNote) {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(180));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
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
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->first().oclAsType(consol::ChiefComplaintSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->first().oclAsType(consol::ChiefComplaintSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ChiefComplaintSection getChiefComplaintSection(ProgressNote progressNote) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(181));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
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
	protected static final String GET_INTERVENTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))->asSequence()->first().oclAsType(consol::InterventionsSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))->asSequence()->first().oclAsType(consol::InterventionsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static InterventionsSection getInterventionsSection(ProgressNote progressNote) {
		if (GET_INTERVENTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(182));
			try {
				GET_INTERVENTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INTERVENTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTIONS_SECTION__EOCL_QRY);
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
	protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::MedicationsSectionEntriesOptional)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::MedicationsSectionEntriesOptional)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional(ProgressNote progressNote) {
		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(183));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
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
	protected static final String GET_OBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))->asSequence()->first().oclAsType(consol::ObjectiveSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))->asSequence()->first().oclAsType(consol::ObjectiveSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ObjectiveSection getObjectiveSection(ProgressNote progressNote) {
		if (GET_OBJECTIVE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(184));
			try {
				GET_OBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_OBJECTIVE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBJECTIVE_SECTION__EOCL_QRY);
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
	protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PhysicalExamSection getPhysicalExamSection(ProgressNote progressNote) {
		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(185));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
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
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemSectionEntriesOptional getProblemSectionEntriesOptional(ProgressNote progressNote) {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(186));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
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
	protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ResultsSectionEntriesOptional)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ResultsSectionEntriesOptional)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ResultsSectionEntriesOptional getResultsSectionEntriesOptional(ProgressNote progressNote) {
		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(187));
			try {
				GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
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
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ReviewOfSystemsSection getReviewOfSystemsSection(ProgressNote progressNote) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(188));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
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
	protected static final String GET_SUBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))->asSequence()->first().oclAsType(consol::SubjectiveSection)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))->asSequence()->first().oclAsType(consol::SubjectiveSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SubjectiveSection getSubjectiveSection(ProgressNote progressNote) {
		if (GET_SUBJECTIVE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(189));
			try {
				GET_SUBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_SUBJECTIVE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECTIVE_SECTION__EOCL_QRY);
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
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)";

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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(ProgressNote progressNote) {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(190));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsCode(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROGRESS_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

} // ProgressNoteOperations
