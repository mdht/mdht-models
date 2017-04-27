/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AutopsyPerformanceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autopsy Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AutopsyPerformanceImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl
		implements AutopsyPerformance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutopsyPerformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.AUTOPSY_PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceUseAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceUseAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutopsyPerformanceHistologicalExamAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AutopsyPerformanceOperations.validateAutopsyPerformanceHistologicalExamAssociation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutopsyPerformance init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutopsyPerformance init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // AutopsyPerformanceImpl
