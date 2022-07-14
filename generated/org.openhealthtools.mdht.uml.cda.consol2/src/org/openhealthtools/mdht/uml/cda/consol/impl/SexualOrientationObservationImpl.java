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
import org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SexualOrientationObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sexual Orientation Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SexualOrientationObservationImpl extends ObservationImpl implements SexualOrientationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SexualOrientationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationIVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSexualOrientationObservationIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SexualOrientationObservationOperations.validateSexualOrientationObservationIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SexualOrientationObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SexualOrientationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SexualOrientationObservationImpl
