/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4;

import org.openhealthtools.mdht.uml.cda.consol.operations.GenderIdentityObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gender Identity Observation V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenderIdentityObservationV4Impl extends SocialHistoryObservationV4Impl
		implements GenderIdentityObservationV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenderIdentityObservationV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV4Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4Value(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV4ValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4ValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV4IVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4IVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV4IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4IVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationV4TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV4Operations.validateSocialHistoryObservationV4TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationV4EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV4Operations.validateSocialHistoryObservationV4EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenderIdentityObservationV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenderIdentityObservationV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GenderIdentityObservationV4Impl
