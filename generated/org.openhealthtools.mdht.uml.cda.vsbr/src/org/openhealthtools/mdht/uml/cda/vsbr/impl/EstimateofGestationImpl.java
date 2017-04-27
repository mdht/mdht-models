/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.EstimateofGestationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estimateof Gestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EstimateofGestationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl
		implements EstimateofGestation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstimateofGestationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.ESTIMATEOF_GESTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimateofGestationOperations.validateEstimateofGestationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimateofGestationOperations.validateEstimateofGestationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimateofGestationOperations.validateEstimateofGestationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimateofGestationOperations.validateEstimateofGestationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimateofGestationOperations.validateEstimateofGestationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimateofGestationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimateofGestationOperations.validateEstimateofGestationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimateofGestation init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimateofGestation init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // EstimateofGestationImpl
