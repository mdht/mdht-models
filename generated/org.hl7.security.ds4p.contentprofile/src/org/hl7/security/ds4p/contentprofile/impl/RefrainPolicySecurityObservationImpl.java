/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation;

import org.hl7.security.ds4p.contentprofile.operations.RefrainPolicySecurityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refrain Policy Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RefrainPolicySecurityObservationImpl extends SecurityObservationImpl
		implements RefrainPolicySecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefrainPolicySecurityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.REFRAIN_POLICY_SECURITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRefrainPolicySecurityObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRefrainPolicySecurityObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRefrainPolicySecurityObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateRefrainPolicySecurityObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateSecurityObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefrainPolicySecurityObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefrainPolicySecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // RefrainPolicySecurityObservationImpl
