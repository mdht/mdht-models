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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;

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
	public boolean validatePatientCareReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportAuthor(this, diagnostics, context);
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
	public boolean validatePatientCareReportHumanAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportHumanAuthor(this, diagnostics, context);
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
	public boolean validatePatientCareReportSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSCurrentMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSCurrentMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSCardiacArrestEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSCardiacArrestEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSAdvanceDirectives(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSAdvanceDirectives(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSPastMedicalHistory(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSPastMedicalHistory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSSocialHistory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSSocialHistory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSPhysicalAssessmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSPhysicalAssessmentSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSMedicationsAdministeredSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSMedicationsAdministeredSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSProceduresPerformedSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSProceduresPerformedSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSPatientCareNarrative(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSPatientCareNarrative(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSSceneSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSSceneSection(this, diagnostics, context);
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
	public boolean validatePatientCareReportEMSDispatchSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSDispatchSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSDispositionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSDispositionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSPersonnelAdverseEventSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSPersonnelAdverseEventSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSProtocolSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSProtocolSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSResponseSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSResponseSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSSituationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSSituationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSTimesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSTimesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSVitalSignsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCareReportEMSHumanAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareReportOperations.validatePatientCareReportEMSHumanAuthorParticipation(
			this, diagnostics, context);
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
	public EMSBillingSection getBilling() {
		return PatientCareReportOperations.getBilling(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSInjuryIncidentDescriptionSection getSection() {
		return PatientCareReportOperations.getSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCurrentMedicationSection getEMSCurrentMedication() {
		return PatientCareReportOperations.getEMSCurrentMedication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCardiacArrestEventSection getEMSCardiacArrestEvent() {
		return PatientCareReportOperations.getEMSCardiacArrestEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAdvanceDirectivesSection getEMSAdvanceDirectives() {
		return PatientCareReportOperations.getEMSAdvanceDirectives(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAllergiesAndAdverseReactionsSection getEMSAllergiesAndAdverseReactionsSection() {
		return PatientCareReportOperations.getEMSAllergiesAndAdverseReactionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPastMedicalHistorySection getEMSPastMedicalHistory() {
		return PatientCareReportOperations.getEMSPastMedicalHistory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSocialHistorySection getEMSSocialHistory() {
		return PatientCareReportOperations.getEMSSocialHistory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPhysicalAssessmentSection getEMSPhysicalAssessmentSection() {
		return PatientCareReportOperations.getEMSPhysicalAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSMedicationsAdministeredSection getEMSMedicationsAdministeredSection() {
		return PatientCareReportOperations.getEMSMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProceduresPerformedSection getEMSProceduresPerformedSection() {
		return PatientCareReportOperations.getEMSProceduresPerformedSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientCareNarrativeSection getEMSPatientCareNarrative() {
		return PatientCareReportOperations.getEMSPatientCareNarrative(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSceneSection getEMSSceneSection() {
		return PatientCareReportOperations.getEMSSceneSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispatchSection getEMSDispatchSection() {
		return PatientCareReportOperations.getEMSDispatchSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection getEMSDispositionSection() {
		return PatientCareReportOperations.getEMSDispositionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPersonnelAdverseEventSection getEMSPersonnelAdverseEventSection() {
		return PatientCareReportOperations.getEMSPersonnelAdverseEventSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProtocolSection getEMSProtocolSection() {
		return PatientCareReportOperations.getEMSProtocolSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSResponseSection getEMSResponseSection() {
		return PatientCareReportOperations.getEMSResponseSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSituationSection getEMSSituationSection() {
		return PatientCareReportOperations.getEMSSituationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSTimesSection getEMSTimesSection() {
		return PatientCareReportOperations.getEMSTimesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSVitalSignsSection getEMSVitalSignsSection() {
		return PatientCareReportOperations.getEMSVitalSignsSection(this);
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
	public PatientCareReport init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientCareReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PatientCareReportImpl
