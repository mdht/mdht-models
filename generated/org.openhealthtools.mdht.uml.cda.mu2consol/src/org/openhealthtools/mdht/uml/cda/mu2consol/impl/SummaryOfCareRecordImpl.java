/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;

import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SummaryOfCareRecordOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summary Of Care Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SummaryOfCareRecordImpl extends GeneralHeaderConstraintsImpl implements SummaryOfCareRecord {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SummaryOfCareRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryOfCareRecordEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordEncountersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection getEncountersSection() {
		return SummaryOfCareRecordOperations.getEncountersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return SummaryOfCareRecordOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return SummaryOfCareRecordOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsSection getInterventionsSection() {
		return SummaryOfCareRecordOperations.getInterventionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection getInstructionsSection() {
		return SummaryOfCareRecordOperations.getInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
		return SummaryOfCareRecordOperations.getHospitalDischargeInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection getAssessmentSection() {
		return SummaryOfCareRecordOperations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection() {
		return SummaryOfCareRecordOperations.getHospitalAdmissionDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection() {
		return SummaryOfCareRecordOperations.getHospitalDischargeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection getPostoperativeDiagnosisSection() {
		return SummaryOfCareRecordOperations.getPostoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection getEncountersSection2() {
		return SummaryOfCareRecordOperations.getEncountersSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return SummaryOfCareRecordOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection getAllergiesSection() {
		return SummaryOfCareRecordOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return SummaryOfCareRecordOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection getReasonForVisitSection() {
		return SummaryOfCareRecordOperations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return SummaryOfCareRecordOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return SummaryOfCareRecordOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection getPreoperativeDiagnosisSection() {
		return SummaryOfCareRecordOperations.getPreoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return SummaryOfCareRecordOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsAdministeredSection getMedicationsAdministeredSection() {
		return SummaryOfCareRecordOperations.getMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return SummaryOfCareRecordOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional() {
		return SummaryOfCareRecordOperations.getHospitalAdmissionMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection() {
		return SummaryOfCareRecordOperations.getHospitalDischargeMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return SummaryOfCareRecordOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return SummaryOfCareRecordOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return SummaryOfCareRecordOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional() {
		return SummaryOfCareRecordOperations.getVitalSignsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return SummaryOfCareRecordOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryOfCareRecord init() {
    	CDAUtil.init(this);
    	return this;
	}
} //SummaryOfCareRecordImpl