package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SummaryOfCareRecordOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Summary Of Care Record</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SummaryOfCareRecordImpl extends GeneralHeaderConstraintsImpl
		implements SummaryOfCareRecord {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SummaryOfCareRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordCarePlanning(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordCarePlanning(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordCognitiveStatusEntries(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordCognitiveStatusEntries(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordFunctionalStatusEntries(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordFunctionalStatusEntries(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordPlanOfCareSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordProblemSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordAllergiesSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordAllergiesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordImmunizationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMedicationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordSocialHistorySection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordResultsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordVitalSignsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordProceduresSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordSocialHistorySectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordPlanOfCareSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordPlanOfCareSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordAssessmentSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordAssessmentSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection retrieveFunctionalStatusSection() {
		return SummaryOfCareRecordOperations.retrieveFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection retrieveHospitalDischargeDiagnosisSection() {
		return SummaryOfCareRecordOperations.retrieveHospitalDischargeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection retrievePostoperativeDiagnosisSection() {
		return SummaryOfCareRecordOperations.retrievePostoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection retrievePostprocedureDiagnosisSection() {
		return SummaryOfCareRecordOperations.retrievePostprocedureDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection getEncountersSection() {
		return SummaryOfCareRecordOperations.getEncountersSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return SummaryOfCareRecordOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return SummaryOfCareRecordOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection getAssessmentSection() {
		return SummaryOfCareRecordOperations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection getPostoperativeDiagnosisSection() {
		return SummaryOfCareRecordOperations.getPostoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return SummaryOfCareRecordOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection getAllergiesSection() {
		return SummaryOfCareRecordOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return SummaryOfCareRecordOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection getPreoperativeDiagnosisSection() {
		return SummaryOfCareRecordOperations.getPreoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return SummaryOfCareRecordOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return SummaryOfCareRecordOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional() {
		return SummaryOfCareRecordOperations.getHospitalAdmissionMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return SummaryOfCareRecordOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return SummaryOfCareRecordOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return SummaryOfCareRecordOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return SummaryOfCareRecordOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection getPostprocedureDiagnosisSection() {
		return SummaryOfCareRecordOperations.getPostprocedureDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection getFunctionalStatusSection() {
		return SummaryOfCareRecordOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SummaryOfCareRecord init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SummaryOfCareRecord init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // SummaryOfCareRecordImpl