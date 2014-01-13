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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;

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
	public boolean validatePatientCareReportPastMedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportPastMedicalHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportSocialHistorySection(this, diagnostics, context);
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
	public boolean validatePatientCareReportPatientCareNarrativeSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportPatientCareNarrativeSection(this, diagnostics, context);
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
	public EMSCurrentMedicationSection getCurrentMedication() {
		return PatientCareReportOperations.getCurrentMedication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCardiacArrestEventSection getCardiacArrestEvent() {
		return PatientCareReportOperations.getCardiacArrestEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAdvanceDirectivesSection getAdvanceDirectives() {
		return PatientCareReportOperations.getAdvanceDirectives(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAllergiesAndAdverseReactionsSection getAllergiesAndAdverseReactionsSection() {
		return PatientCareReportOperations.getAllergiesAndAdverseReactionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPastMedicalHistorySection getPastMedicalHistorySection() {
		return PatientCareReportOperations.getPastMedicalHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSocialHistorySection getSocialHistorySection() {
		return PatientCareReportOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPhysicalAssessmentSection getPhysicalAssessmentSection() {
		return PatientCareReportOperations.getPhysicalAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSMedicationsAdministeredSection getMedicationsAdministeredSection() {
		return PatientCareReportOperations.getMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProceduresPerformedSection getProceduresPerformedSection() {
		return PatientCareReportOperations.getProceduresPerformedSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientCareNarrativeSection getPatientCareNarrativeSection() {
		return PatientCareReportOperations.getPatientCareNarrativeSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSceneSection getSceneSection() {
		return PatientCareReportOperations.getSceneSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispatchSection getDispatchSection() {
		return PatientCareReportOperations.getDispatchSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection getDispositionSection() {
		return PatientCareReportOperations.getDispositionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPersonnelAdverseEventSection getPersonnelAdverseEventSection() {
		return PatientCareReportOperations.getPersonnelAdverseEventSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProtocolSection getProtocolSection() {
		return PatientCareReportOperations.getProtocolSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSResponseSection getResponseSection() {
		return PatientCareReportOperations.getResponseSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSituationSection getSituationSection() {
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
	public EMSVitalSignsSection getVitalSignsSection() {
		return PatientCareReportOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSInjuryIncidentDescriptionSection getInjuryIncidentDescriptionSection() {
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
	@Override
	public boolean validateGeneralHeaderConstraintsId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validateGeneralHeaderConstraintsId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validateGeneralHeaderConstraintsTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validateGeneralHeaderConstraintsVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validateGeneralHeaderConstraintsComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validateGeneralHeaderConstraintsCustodian(this, diagnostics, context);
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
