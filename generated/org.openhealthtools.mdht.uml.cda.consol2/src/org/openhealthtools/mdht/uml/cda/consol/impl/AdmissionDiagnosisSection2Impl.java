/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionDiagnosisSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admission Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdmissionDiagnosisSection2Impl extends HospitalAdmissionDiagnosisSectionImpl implements
		AdmissionDiagnosisSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmissionDiagnosisSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADMISSION_DIAGNOSIS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosis2 getConsolHospitalAdmissionDiagnosis2() {
		return AdmissionDiagnosisSection2Operations.getConsolHospitalAdmissionDiagnosis2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalAdmissionDiagnosisSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalAdmissionDiagnosisSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalAdmissionDiagnosisSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionDiagnosisSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdmissionDiagnosisSection2Impl
