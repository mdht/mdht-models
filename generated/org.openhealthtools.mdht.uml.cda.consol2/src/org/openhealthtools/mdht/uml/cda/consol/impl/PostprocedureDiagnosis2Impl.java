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
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PostprocedureDiagnosis2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postprocedure Diagnosis2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PostprocedureDiagnosis2Impl extends PostprocedureDiagnosisImpl implements PostprocedureDiagnosis2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostprocedureDiagnosis2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostprocedureDiagnosis2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosis2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePostprocedureDiagnosisCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosisCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProblemObservation2> getConsolProblemObservation2s() {
		return PostprocedureDiagnosis2Operations.getConsolProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePostprocedureDiagnosisCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosisCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePostprocedureDiagnosisProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosisProblemObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosis2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosis2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PostprocedureDiagnosis2Impl
