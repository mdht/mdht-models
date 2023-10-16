/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.GenderIdentityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gender Identity Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenderIdentityObservationImpl extends SocialHistoryObservationV4Impl implements GenderIdentityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenderIdentityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationOperations.validateGenderIdentityObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationOperations.validateGenderIdentityObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationOperations.validateGenderIdentityObservationIVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationOperations.validateGenderIdentityObservationIVLTSHigh(
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
		return GenderIdentityObservationOperations.validateSocialHistoryObservationV4EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenderIdentityObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenderIdentityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GenderIdentityObservationImpl
