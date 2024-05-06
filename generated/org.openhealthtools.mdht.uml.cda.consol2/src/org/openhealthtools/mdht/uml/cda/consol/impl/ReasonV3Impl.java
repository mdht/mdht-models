/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReasonV3;

import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonV3Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason V3</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReasonV3Impl extends ObservationImpl implements ReasonV3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonV3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REASON_V3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonV3IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonV3Operations.validateReasonV3IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonV3 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonV3 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReasonV3Impl
