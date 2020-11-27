/**
 */
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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2AssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2AssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2AllergiesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2InterventionsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Interventions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2InstructionsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Instructions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2MedicationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ObjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2PhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ProblemSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ResultsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Results Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2SubjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2VitalSignsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2NutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getAllergiesSectionEntriesOptional2() <em>Get Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getInterventionsSection2() <em>Get Interventions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getInstructionsSection2() <em>Get Instructions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getMedicationsSectionEntriesOptional2() <em>Get Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getObjectiveSection() <em>Get Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getProblemSectionEntriesOptional2() <em>Get Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getResultsSectionEntriesOptional2() <em>Get Results Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getSubjectiveSection() <em>Get Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getVitalSignsSectionEntriesOptional2() <em>Get Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateUSRealmHeader2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressNote2Operations extends USRealmHeader2Operations {
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
	protected ProgressNote2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProgressNote2ProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			"ERROR");

		if (VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ProgressNote2ProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProgressNote2ProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent",
			"ERROR");

		if (VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT,
						ConsolPlugin.INSTANCE.getString(
							"ProgressNote2ProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2CodeP(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2CodeP(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2CodeP(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2CodeP(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2CodeP(ProgressNote2 progressNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2CodeP", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_CODE_P,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2CodeP"),
						new Object[] { progressNote2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProgressNote2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProgressNote2CodeP", passToken);
				}
				passToken.add(progressNote2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2Code(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2Code(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11506-3' or value.code = '18733-6' or value.code = '18762-5' or value.code = '28569-2' or value.code = '28617-9' or value.code = '34900-1' or value.code = '34904-3' or value.code = '18764-1' or value.code = '28623-7' or value.code = '11507-1' or value.code = '11508-9' or value.code = '11509-7' or value.code = '28627-8' or value.code = '11510-5' or value.code = '28656-7' or value.code = '11512-1' or value.code = '34126-3' or value.code = '15507-7' or value.code = '34129-7' or value.code = '34125-5' or value.code = '34130-5' or value.code = '34131-3' or value.code = '34124-8' or value.code = '34127-1' or value.code = '34128-9' or value.code = '34901-9' or value.code = '34132-1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2Code(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2Code(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2Code(ProgressNote2 progressNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProgressNote2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(progressNote2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2Code", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_CODE,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2Code"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DocumentationOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DocumentationOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2DocumentationOf(ProgressNote2 progressNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2DocumentationOf", "WARNING");

		if (VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOCUMENTATION_OF,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2DocumentationOf"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOf(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2ComponentOf(ProgressNote2 progressNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ComponentOf", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2ComponentOf"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2AssessmentSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2AssessmentSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2AssessmentSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2AssessmentSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2AssessmentSection(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2AssessmentSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_ASSESSMENT_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2AssessmentSection"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2PlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2PlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2PlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2PlanOfTreatmentSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2PlanOfTreatmentSection2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2PlanOfTreatmentSection2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2PlanOfTreatmentSection2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2AssessmentAndPlanSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2AssessmentAndPlanSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2AssessmentAndPlanSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment And Plan Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2AssessmentAndPlanSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2AssessmentAndPlanSection2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2AssessmentAndPlanSection2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2AssessmentAndPlanSection2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2AllergiesSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Allergies Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2AllergiesSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2AllergiesSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Allergies Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2AllergiesSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2AllergiesSectionEntriesOptional2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2AllergiesSectionEntriesOptional2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2AllergiesSectionEntriesOptional2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ChiefComplaintSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ChiefComplaintSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ChiefComplaintSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ChiefComplaintSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2ChiefComplaintSection(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ChiefComplaintSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2ChiefComplaintSection"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2InterventionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Interventions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2InterventionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2InterventionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Interventions Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2InterventionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2InterventionsSection2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2InterventionsSection2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_INTERVENTIONS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2InterventionsSection2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2InstructionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Instructions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2InstructionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2InstructionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Instructions Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2InstructionsSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2InstructionsSection2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2InstructionsSection2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_INSTRUCTIONS_SECTION2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2InstructionsSection2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2MedicationsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2MedicationsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2MedicationsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Medications Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2MedicationsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2MedicationsSectionEntriesOptional2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2MedicationsSectionEntriesOptional2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2MedicationsSectionEntriesOptional2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ObjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ObjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ObjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Objective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ObjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2ObjectiveSection(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ObjectiveSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_OBJECTIVE_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2ObjectiveSection"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2PhysicalExamSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2PhysicalExamSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2PhysicalExamSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Physical Exam Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2PhysicalExamSection2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2PhysicalExamSection2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2PhysicalExamSection2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2PhysicalExamSection2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ProblemSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Problem Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ProblemSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ProblemSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Problem Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ProblemSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2ProblemSectionEntriesOptional2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ProblemSectionEntriesOptional2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2ProblemSectionEntriesOptional2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ResultsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Results Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ResultsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ResultsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Results Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ResultsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2ResultsSectionEntriesOptional2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ResultsSectionEntriesOptional2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2ResultsSectionEntriesOptional2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ReviewOfSystemsSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ReviewOfSystemsSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ReviewOfSystemsSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ReviewOfSystemsSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2ReviewOfSystemsSection(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ReviewOfSystemsSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2ReviewOfSystemsSection"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2SubjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2SubjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2SubjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Subjective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2SubjectiveSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2SubjectiveSection(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2SubjectiveSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_SUBJECTIVE_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2SubjectiveSection"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2VitalSignsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Vital Signs Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2VitalSignsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2VitalSignsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Vital Signs Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2VitalSignsSectionEntriesOptional2(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2VitalSignsSectionEntriesOptional2(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2VitalSignsSectionEntriesOptional2", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2VitalSignsSectionEntriesOptional2"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2NutritionSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2NutritionSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2NutritionSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Nutrition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2NutritionSection(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressNote2NutritionSection(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2NutritionSection", "INFO");

		if (VALIDATE_PROGRESS_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_PROGRESS_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGRESS_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_NUTRITION_SECTION,
						ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2NutritionSection"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNote2ProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow", "WARNING");

		if (VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNote2ProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DocumentationOfServiceEventTemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventTemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.3.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DocumentationOfServiceEventTemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventTemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2DocumentationOfServiceEventTemplateId(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2DocumentationOfServiceEventTemplateId", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2DocumentationOfServiceEventTemplateId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DocumentationOfServiceEventClassCode(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventClassCode(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DocumentationOfServiceEventClassCode(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventClassCode(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2DocumentationOfServiceEventClassCode(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2DocumentationOfServiceEventClassCode", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2DocumentationOfServiceEventClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DocumentationOfServiceEventEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DocumentationOfServiceEventEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEventEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2DocumentationOfServiceEventEffectiveTime(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNote2ProgressNote2DocumentationOfServiceEventEffectiveTime", "WARNING");

		if (VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2DocumentationOfServiceEventEffectiveTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2DocumentationOfServiceEvent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEvent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2DocumentationOfServiceEvent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2DocumentationOfServiceEvent(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2DocumentationOfServiceEvent(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2DocumentationOfServiceEvent", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT,
							ConsolPlugin.INSTANCE.getString("ProgressNote2ProgressNote2DocumentationOfServiceEvent"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter US Realm Date And Time DT Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter US Realm Date And Time DT Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNote2ProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null).healthCareFacility->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNote2ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null)->reject(healthCareFacility->one(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNote2ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2ComponentOfEncompassingEncounterId(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ComponentOfEncompassingEncounterId", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2ComponentOfEncompassingEncounterId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(
			ProgressNote2 progressNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressNote2ProgressNote2ComponentOfEncompassingEncounterEffectiveTime", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2ComponentOfEncompassingEncounterEffectiveTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterLocation(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterLocation(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOfEncompassingEncounterLocation(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounterLocation(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2ComponentOfEncompassingEncounterLocation(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ComponentOfEncompassingEncounterLocation", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2ComponentOfEncompassingEncounterLocation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNote2ComponentOfEncompassingEncounter(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounter(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNote2ComponentOfEncompassingEncounter(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNote2ComponentOfEncompassingEncounter(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProgressNote2ComponentOfEncompassingEncounter(ProgressNote2 progressNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2ProgressNote2ComponentOfEncompassingEncounter", "ERROR");

		if (VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			progressNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROGRESS_NOTE2__PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
							ConsolPlugin.INSTANCE.getString(
								"ProgressNote2ProgressNote2ComponentOfEncompassingEncounter"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(ProgressNote2) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(ProgressNote2) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentSection getAssessmentSection(ProgressNote2 progressNote2) {

		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(378));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfTreatmentSection2(ProgressNote2) <em>Get Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->asSequence()->any(true).oclAsType(consol::PlanOfTreatmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfTreatmentSection2(ProgressNote2) <em>Get Plan Of Treatment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfTreatmentSection2 getPlanOfTreatmentSection2(ProgressNote2 progressNote2) {

		if (GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(379));
			try {
				GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY);
		return (PlanOfTreatmentSection2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection2(ProgressNote2) <em>Get Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection2)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection2(ProgressNote2) <em>Get Assessment And Plan Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection2 getAssessmentAndPlanSection2(ProgressNote2 progressNote2) {

		if (GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(380));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY = helper.createQuery(
					GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY);
		return (AssessmentAndPlanSection2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional2(ProgressNote2) <em>Get Allergies Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional2(ProgressNote2) <em>Get Allergies Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSectionEntriesOptional2 getAllergiesSectionEntriesOptional2(ProgressNote2 progressNote2) {

		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(381));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AllergiesSectionEntriesOptional2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(ProgressNote2) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(ProgressNote2) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(ProgressNote2 progressNote2) {

		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(382));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionsSection2(ProgressNote2) <em>Get Interventions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2))->asSequence()->any(true).oclAsType(consol::InterventionsSection2)";

	/**
	 * The cached OCL query for the '{@link #getInterventionsSection2(ProgressNote2) <em>Get Interventions Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InterventionsSection2 getInterventionsSection2(ProgressNote2 progressNote2) {

		if (GET_INTERVENTIONS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(383));
			try {
				GET_INTERVENTIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_INTERVENTIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INTERVENTIONS_SECTION2__EOCL_QRY);
		return (InterventionsSection2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructionsSection2(ProgressNote2) <em>Get Instructions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection2))->asSequence()->any(true).oclAsType(consol::InstructionsSection2)";

	/**
	 * The cached OCL query for the '{@link #getInstructionsSection2(ProgressNote2) <em>Get Instructions Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InstructionsSection2 getInstructionsSection2(ProgressNote2 progressNote2) {

		if (GET_INSTRUCTIONS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(384));
			try {
				GET_INSTRUCTIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTIONS_SECTION2__EOCL_QRY);
		return (InstructionsSection2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional2(ProgressNote2) <em>Get Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::MedicationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional2(ProgressNote2) <em>Get Medications Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSectionEntriesOptional2 getMedicationsSectionEntriesOptional2(
			ProgressNote2 progressNote2) {

		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(385));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (MedicationsSectionEntriesOptional2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getObjectiveSection(ProgressNote2) <em>Get Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))->asSequence()->any(true).oclAsType(consol::ObjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getObjectiveSection(ProgressNote2) <em>Get Objective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ObjectiveSection getObjectiveSection(ProgressNote2 progressNote2) {

		if (GET_OBJECTIVE_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(386));
			try {
				GET_OBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_OBJECTIVE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_OBJECTIVE_SECTION__EOCL_QRY);
		return (ObjectiveSection) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection2(ProgressNote2) <em>Get Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection2)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection2(ProgressNote2) <em>Get Physical Exam Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PhysicalExamSection2 getPhysicalExamSection2(ProgressNote2 progressNote2) {

		if (GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(387));
			try {
				GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY);
		return (PhysicalExamSection2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional2(ProgressNote2) <em>Get Problem Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ProblemSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional2(ProgressNote2) <em>Get Problem Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSectionEntriesOptional2 getProblemSectionEntriesOptional2(ProgressNote2 progressNote2) {

		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(388));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ProblemSectionEntriesOptional2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSectionEntriesOptional2(ProgressNote2) <em>Get Results Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ResultsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getResultsSectionEntriesOptional2(ProgressNote2) <em>Get Results Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSectionEntriesOptional2 getResultsSectionEntriesOptional2(ProgressNote2 progressNote2) {

		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(389));
			try {
				GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ResultsSectionEntriesOptional2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ProgressNote2) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ProgressNote2) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReviewOfSystemsSection getReviewOfSystemsSection(ProgressNote2 progressNote2) {

		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(390));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectiveSection(ProgressNote2) <em>Get Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))->asSequence()->any(true).oclAsType(consol::SubjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getSubjectiveSection(ProgressNote2) <em>Get Subjective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SubjectiveSection getSubjectiveSection(ProgressNote2 progressNote2) {

		if (GET_SUBJECTIVE_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(391));
			try {
				GET_SUBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_SUBJECTIVE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUBJECTIVE_SECTION__EOCL_QRY);
		return (SubjectiveSection) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional2(ProgressNote2) <em>Get Vital Signs Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional2(ProgressNote2) <em>Get Vital Signs Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional2(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSectionEntriesOptional2 getVitalSignsSectionEntriesOptional2(ProgressNote2 progressNote2) {

		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(392));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional2) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionSection(ProgressNote2) <em>Get Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))->asSequence()->any(true).oclAsType(consol::NutritionSection)";

	/**
	 * The cached OCL query for the '{@link #getNutritionSection(ProgressNote2) <em>Get Nutrition Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(ProgressNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NutritionSection getNutritionSection(ProgressNote2 progressNote2) {

		if (GET_NUTRITION_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE2,
				ConsolPackage.Literals.PROGRESS_NOTE2.getEAllOperations().get(393));
			try {
				GET_NUTRITION_SECTION__EOCL_QRY = helper.createQuery(GET_NUTRITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUTRITION_SECTION__EOCL_QRY);
		return (NutritionSection) query.evaluate(progressNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2TemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.9' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2TemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(ProgressNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressNote2 The receiving '<em><b>Progress Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeader2TemplateId(ProgressNote2 progressNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressNote2USRealmHeader2TemplateId", "ERROR");

		if (VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE2);
			try {
				VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(progressNote2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_NOTE2__US_REALM_HEADER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ProgressNote2USRealmHeader2TemplateId"),
						new Object[] { progressNote2 }));
			}

			return false;
		}
		return true;
	}

} // ProgressNote2Operations
