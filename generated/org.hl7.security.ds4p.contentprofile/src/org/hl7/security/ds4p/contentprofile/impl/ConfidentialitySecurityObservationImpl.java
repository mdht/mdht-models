/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation;
import org.hl7.security.ds4p.contentprofile.operations.ConfidentialitySecurityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confidentiality Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConfidentialitySecurityObservationImpl extends SecurityObservationImpl
		implements ConfidentialitySecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfidentialitySecurityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.CONFIDENTIALITY_SECURITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConfidentialitySecurityObservationOperations.validateSecurityObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConfidentialitySecurityObservationOperations.validateSecurityObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConfidentialitySecurityObservationOperations.validateSecurityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConfidentialitySecurityObservationOperations.validateSecurityObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialitySecurityObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialitySecurityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ConfidentialitySecurityObservationImpl
