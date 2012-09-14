package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;
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
	public boolean validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(this, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordAllergiesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordHospitalDischargeMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordHospitalDischargeMedicationsSection(this, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordFunctionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordFunctionalStatusSection(this, diagnostics, context);
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
	public boolean validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(this, diagnostics, context);
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
	public boolean validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(this, diagnostics, context);
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
	public boolean validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(this, diagnostics, context);
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
	public boolean validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(this, diagnostics, context);
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
	public InterventionsSection getInterventionsSection() {
		return SummaryOfCareRecordOperations.getInterventionsSection(this);
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
	public HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection() {
		return SummaryOfCareRecordOperations.getHospitalAdmissionDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection() {
		return SummaryOfCareRecordOperations.getHospitalDischargeDiagnosisSection(this);
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
	public HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection() {
		return SummaryOfCareRecordOperations.getHospitalDischargeMedicationsSection(this);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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