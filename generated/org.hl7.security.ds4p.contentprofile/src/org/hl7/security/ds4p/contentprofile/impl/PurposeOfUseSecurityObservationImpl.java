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
import org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation;

import org.hl7.security.ds4p.contentprofile.operations.PurposeOfUseSecurityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purpose Of Use Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PurposeOfUseSecurityObservationImpl extends SecurityObservationImpl
		implements PurposeOfUseSecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeOfUseSecurityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.PURPOSE_OF_USE_SECURITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeOfUseSecurityObservationOperations.validateSecurityObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeOfUseSecurityObservationOperations.validateSecurityObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeOfUseSecurityObservationOperations.validateSecurityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeOfUseSecurityObservationOperations.validateSecurityObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeOfUseSecurityObservationOperations.validateSecurityObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PurposeOfUseSecurityObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PurposeOfUseSecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PurposeOfUseSecurityObservationImpl
