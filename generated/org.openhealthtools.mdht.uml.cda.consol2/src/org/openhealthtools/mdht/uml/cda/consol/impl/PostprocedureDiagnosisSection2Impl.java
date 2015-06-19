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
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PostprocedureDiagnosisSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postprocedure Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PostprocedureDiagnosisSection2Impl extends PostprocedureDiagnosisSectionImpl implements
		PostprocedureDiagnosisSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostprocedureDiagnosisSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosis2 getConsolPostprocedureDiagnosis2() {
		return PostprocedureDiagnosisSection2Operations.getConsolPostprocedureDiagnosis2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePostprocedureDiagnosisSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePostprocedureDiagnosisSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePostprocedureDiagnosisSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosisSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PostprocedureDiagnosisSection2Impl
