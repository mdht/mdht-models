/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ObligationPolicySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.operations.ObligationPolicySecurityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obligation Policy Security Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ObligationPolicySecurityObservationImpl extends SecurityObservationImpl implements ObligationPolicySecurityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObligationPolicySecurityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.OBLIGATION_POLICY_SECURITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObligationPolicySecurityObservationOperations.validateSecurityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObligationPolicySecurityObservationOperations.validateSecurityObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObligationPolicySecurityObservationOperations.validateSecurityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObligationPolicySecurityObservationOperations.validateSecurityObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSecurityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObligationPolicySecurityObservationOperations.validateSecurityObservationValue(this, diagnostics, context);
	}
} //ObligationPolicySecurityObservationImpl
