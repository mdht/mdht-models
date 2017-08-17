/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.operations.RefrainPolicySecurityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refrain Policy Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RefrainPolicySecurityObservationImpl extends SecurityObservationImpl implements RefrainPolicySecurityObservation {
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
		return CONSENTDIRECTIVEPackage.Literals.REFRAIN_POLICY_SECURITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateSecurityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateSecurityObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateSecurityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateSecurityObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RefrainPolicySecurityObservationOperations.validateSecurityObservationValue(this, diagnostics, context);
	}
} //RefrainPolicySecurityObservationImpl
