/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection2;

import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionDiagnosisSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Admission Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosisSection2Impl extends HospitalAdmissionDiagnosisSectionImpl implements
		HospitalAdmissionDiagnosisSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionDiagnosisSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosis2 getConsolHospitalAdmissionDiagnosis2() {
		return HospitalAdmissionDiagnosisSection2Operations.getConsolHospitalAdmissionDiagnosis2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalAdmissionDiagnosisSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionTemplateId(
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
		return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCodeP(
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
		return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosisSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HospitalAdmissionDiagnosisSection2Impl
