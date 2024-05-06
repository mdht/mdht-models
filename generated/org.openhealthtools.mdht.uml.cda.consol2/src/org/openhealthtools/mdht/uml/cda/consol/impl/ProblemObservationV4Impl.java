/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Observation V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemObservationV4Impl extends ProblemObservation2Impl implements ProblemObservationV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemObservationV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_OBSERVATION_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4ValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4ValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationV4IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationV4Operations.validateProblemObservationV4IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservationV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservationV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemObservationV4Impl
