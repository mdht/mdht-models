/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.BillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientCareReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Care Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientCareReportImpl extends GeneralHeaderConstraintsImpl implements PatientCareReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientCareReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_CARE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportConfidentialityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportBilling(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportBilling(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportCurrentMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportCurrentMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportCardiacArrestEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportCardiacArrestEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportAdvanceDirectives(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportAdvanceDirectives(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportAllergiesAndAdverseReactionsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportAllergiesAndAdverseReactionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportPastMedicalHistory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportPastMedicalHistory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportSocialHistory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportSocialHistory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportPhysicalAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportPhysicalAssessmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportMedicationsAdministeredSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportMedicationsAdministeredSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportProceduresPerformedSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportProceduresPerformedSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportPatientCareNarrative(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportPatientCareNarrative(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportSceneSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportSceneSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportDispatchSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportDispatchSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportDispositionSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportDispositionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportPersonnelAdverseEventSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportPersonnelAdverseEventSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportProtocolSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportProtocolSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportResponseSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportResponseSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportSituationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportSituationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportTimesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportTimesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportRelatedDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportInjuryIncidentDescriptionSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportInjuryIncidentDescriptionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingSection getBilling() {
		return PatientCareReportOperations.getBilling(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentMedicationSection getCurrentMedication() {
		return PatientCareReportOperations.getCurrentMedication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestEventSection getCardiacArrestEvent() {
		return PatientCareReportOperations.getCardiacArrestEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection getAdvanceDirectives() {
		return PatientCareReportOperations.getAdvanceDirectives(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesAndAdverseReactionsSection getAllergiesAndAdverseReactionsSection() {
		return PatientCareReportOperations.getAllergiesAndAdverseReactionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PastMedicalHistorySection getPastMedicalHistory() {
		return PatientCareReportOperations.getPastMedicalHistory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistory() {
		return PatientCareReportOperations.getSocialHistory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAssessmentSection getPhysicalAssessmentSection() {
		return PatientCareReportOperations.getPhysicalAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsAdministeredSection getMedicationsAdministeredSection() {
		return PatientCareReportOperations.getMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresPerformedSection getProceduresPerformedSection() {
		return PatientCareReportOperations.getProceduresPerformedSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCareNarrativeSection getPatientCareNarrative() {
		return PatientCareReportOperations.getPatientCareNarrative(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneSection getSceneSection() {
		return PatientCareReportOperations.getSceneSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchSection getDispatchSection() {
		return PatientCareReportOperations.getDispatchSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispositionSection getDispositionSection() {
		return PatientCareReportOperations.getDispositionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonnelAdverseEventSection getPersonnelAdverseEventSection() {
		return PatientCareReportOperations.getPersonnelAdverseEventSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolSection getProtocolSection() {
		return PatientCareReportOperations.getProtocolSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseSection getResponseSection() {
		return PatientCareReportOperations.getResponseSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationSection getSituationSection() {
		return PatientCareReportOperations.getSituationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimesSection getTimesSection() {
		return PatientCareReportOperations.getTimesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return PatientCareReportOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryIncidentDescriptionSection getInjuryIncidentDescriptionSection() {
		return PatientCareReportOperations.getInjuryIncidentDescriptionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCareReport init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatientCareReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PatientCareReportImpl
