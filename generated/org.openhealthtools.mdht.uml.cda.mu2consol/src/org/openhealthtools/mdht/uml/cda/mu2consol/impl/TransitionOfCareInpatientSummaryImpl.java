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

import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;

import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareInpatientSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Of Care Inpatient Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TransitionOfCareInpatientSummaryImpl extends SummaryOfCareRecordImpl implements TransitionOfCareInpatientSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionOfCareInpatientSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalDischargeInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalDischargeMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalAdmissionDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	@Override
	public TransitionOfCareInpatientSummary init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TransitionOfCareInpatientSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TransitionOfCareInpatientSummaryImpl
