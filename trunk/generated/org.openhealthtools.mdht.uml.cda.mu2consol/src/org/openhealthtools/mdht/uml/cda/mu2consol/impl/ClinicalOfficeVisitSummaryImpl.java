/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;

import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ClinicalOfficeVisitSummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Clinical Office Visit Summary</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClinicalOfficeVisitSummaryImpl extends
		GeneralHeaderConstraintsImpl implements ClinicalOfficeVisitSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalOfficeVisitSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryLocation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryReasonForOfficeVisit(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryReasonForOfficeVisit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryCarePlanning(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryCarePlanning(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummarySocialHistorySection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarySocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryProblemSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryAllergiesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryAllergiesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryResultsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryPlanOfCareSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryProceduresSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryInstructionsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryInstructionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection retrievePlanOfCareSection() {
		return ClinicalOfficeVisitSummaryOperations.retrievePlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return ClinicalOfficeVisitSummaryOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return ClinicalOfficeVisitSummaryOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ClinicalOfficeVisitSummaryOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection getAllergiesSection() {
		return ClinicalOfficeVisitSummaryOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return ClinicalOfficeVisitSummaryOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return ClinicalOfficeVisitSummaryOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return ClinicalOfficeVisitSummaryOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return ClinicalOfficeVisitSummaryOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return ClinicalOfficeVisitSummaryOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsAdministeredSection getMedicationsAdministeredSection() {
		return ClinicalOfficeVisitSummaryOperations.getMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection getReasonForVisitSection() {
		return ClinicalOfficeVisitSummaryOperations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return ClinicalOfficeVisitSummaryOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return ClinicalOfficeVisitSummaryOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return ClinicalOfficeVisitSummaryOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection getInstructionsSection() {
		return ClinicalOfficeVisitSummaryOperations.getInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOfficeVisitSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalOfficeVisitSummary init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ClinicalOfficeVisitSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ClinicalOfficeVisitSummaryImpl
