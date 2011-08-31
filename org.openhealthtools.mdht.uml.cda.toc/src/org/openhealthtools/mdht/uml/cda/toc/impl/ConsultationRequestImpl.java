/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.impl.GeneralHeaderConstraintsImpl;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.ToCPackage;
import org.openhealthtools.mdht.uml.cda.toc.operations.ConsultationRequestOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsultationRequestImpl extends GeneralHeaderConstraintsImpl implements ConsultationRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToCPackage.Literals.CONSULTATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestAllergiesReactionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestAllergiesReactionsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestMedicationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestProblemListSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestProblemListSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestSurgeriesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestSurgeriesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestDiagnosticResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestDiagnosticResultsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestAdvanceDirectivesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestAdvanceDirectivesSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestAssessmentAndPlanSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestAssessmentAndPlanSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestHistoryOfPresentIllness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestHistoryOfPresentIllness(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestPhysicalExamSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestPhysicalExamSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestReasonForReferralSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestReasonForReferralSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestEncountersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestFamilyHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestFunctionalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestFunctionalStatusSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestImmunizationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestMedicalEquipmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestMedicalEquipmentSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestSocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestChiefComplaintSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestGeneralStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestGeneralStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestHistoryOfPastIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestHistoryOfPastIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationRequestPayersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationRequestOperations.validateConsultationRequestPayersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection getAllergiesReactionsSection() {
		return ConsultationRequestOperations.getAllergiesReactionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ConsultationRequestOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection getProblemListSection() {
		return ConsultationRequestOperations.getProblemListSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection getSurgeriesSection() {
		return ConsultationRequestOperations.getSurgeriesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticResultsSection getDiagnosticResultsSection() {
		return ConsultationRequestOperations.getDiagnosticResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection getAdvanceDirectivesSection() {
		return ConsultationRequestOperations.getAdvanceDirectivesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return ConsultationRequestOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllness getHistoryOfPresentIllness() {
		return ConsultationRequestOperations.getHistoryOfPresentIllness(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection getPhysicalExamSection() {
		return ConsultationRequestOperations.getPhysicalExamSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection getReasonForReferralSection() {
		return ConsultationRequestOperations.getReasonForReferralSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection getEncountersSection() {
		return ConsultationRequestOperations.getEncountersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return ConsultationRequestOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection getFunctionalStatusSection() {
		return ConsultationRequestOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return ConsultationRequestOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection getMedicalEquipmentSection() {
		return ConsultationRequestOperations.getMedicalEquipmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return ConsultationRequestOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return ConsultationRequestOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return ConsultationRequestOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return ConsultationRequestOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection getGeneralStatusSection() {
		return ConsultationRequestOperations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return ConsultationRequestOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection getPayersSection() {
		return ConsultationRequestOperations.getPayersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationRequestOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationRequest init() {
		CDAUtil.init(this);
		return this;
	}
} // ConsultationRequestImpl
