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
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4;

import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Observation V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SocialHistoryObservationV4Impl extends ObservationImpl implements SocialHistoryObservationV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistoryObservationV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOCIAL_HISTORY_OBSERVATION_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4ClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4MoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4StatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4StatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4StatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4StatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservationV4EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservationV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservationV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SocialHistoryObservationV4Impl
