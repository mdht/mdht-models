/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
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
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProgressNote2Impl extends USRealmHeader2Impl implements ProgressNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGRESS_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2AssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2AssessmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2PlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2PlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2AssessmentAndPlanSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2AssessmentAndPlanSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2AllergiesSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2AllergiesSectionEntriesOptional2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2InterventionsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2InterventionsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2InstructionsSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2InstructionsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2MedicationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2MedicationsSectionEntriesOptional2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ObjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ObjectiveSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2PhysicalExamSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2PhysicalExamSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ProblemSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ProblemSectionEntriesOptional2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ResultsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ResultsSectionEntriesOptional2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2SubjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2SubjectiveSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2VitalSignsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2VitalSignsSectionEntriesOptional2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2NutritionSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2NutritionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection getAssessmentSection() {
		return ProgressNote2Operations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 getPlanOfTreatmentSection2() {
		return ProgressNote2Operations.getPlanOfTreatmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection2 getAssessmentAndPlanSection2() {
		return ProgressNote2Operations.getAssessmentAndPlanSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional2 getAllergiesSectionEntriesOptional2() {
		return ProgressNote2Operations.getAllergiesSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return ProgressNote2Operations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsSection2 getInterventionsSection2() {
		return ProgressNote2Operations.getInterventionsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection2 getInstructionsSection2() {
		return ProgressNote2Operations.getInstructionsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionEntriesOptional2 getMedicationsSectionEntriesOptional2() {
		return ProgressNote2Operations.getMedicationsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSection getObjectiveSection() {
		return ProgressNote2Operations.getObjectiveSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection2 getPhysicalExamSection2() {
		return ProgressNote2Operations.getPhysicalExamSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional2 getProblemSectionEntriesOptional2() {
		return ProgressNote2Operations.getProblemSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionEntriesOptional2 getResultsSectionEntriesOptional2() {
		return ProgressNote2Operations.getResultsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return ProgressNote2Operations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveSection getSubjectiveSection() {
		return ProgressNote2Operations.getSubjectiveSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional2 getVitalSignsSectionEntriesOptional2() {
		return ProgressNote2Operations.getVitalSignsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionSection getNutritionSection() {
		return ProgressNote2Operations.getNutritionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateUSRealmHeader2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote2Operations.validateUSRealmHeader2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressNote2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProgressNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProgressNote2Impl
