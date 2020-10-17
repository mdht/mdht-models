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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosis2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Discharge Diagnosis2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HospitalDischargeDiagnosis2Impl extends HospitalDischargeDiagnosisImpl
		implements HospitalDischargeDiagnosis2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeDiagnosis2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeDiagnosis2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosis2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeDiagnosisCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProblemObservation2> getConsolProblemObservation2s() {
		return HospitalDischargeDiagnosis2Operations.getConsolProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeDiagnosisCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeDiagnosisProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisProblemObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeDiagnosis2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeDiagnosis2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HospitalDischargeDiagnosis2Impl
