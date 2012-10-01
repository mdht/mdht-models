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

import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;

import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareInpatientSummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transition Of Care Inpatient Summary</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TransitionOfCareInpatientSummaryImpl extends
		SummaryOfCareRecordImpl implements TransitionOfCareInpatientSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionOfCareInpatientSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalDischargeInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalDischargeMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalAdmissionDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalDischargeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalAdmissionMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionOfCareInpatientSummary init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public TransitionOfCareInpatientSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TransitionOfCareInpatientSummaryImpl
