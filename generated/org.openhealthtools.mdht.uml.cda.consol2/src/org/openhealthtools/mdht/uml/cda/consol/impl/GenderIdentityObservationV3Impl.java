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
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3;

import org.openhealthtools.mdht.uml.cda.consol.operations.GenderIdentityObservationV3Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gender Identity Observation V3</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenderIdentityObservationV3Impl extends ObservationImpl implements GenderIdentityObservationV3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenderIdentityObservationV3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3Code(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3StatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3StatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3Value(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3ValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3ValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderIdentityObservationV3 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderIdentityObservationV3 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GenderIdentityObservationV3Impl
