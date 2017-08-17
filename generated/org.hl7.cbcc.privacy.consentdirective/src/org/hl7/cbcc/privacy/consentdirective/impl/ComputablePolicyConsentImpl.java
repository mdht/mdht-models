/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent;
import org.hl7.cbcc.privacy.consentdirective.operations.ComputablePolicyConsentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computable Policy Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ComputablePolicyConsentImpl extends ObservationImpl implements ComputablePolicyConsent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputablePolicyConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.COMPUTABLE_POLICY_CONSENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComputablePolicyConsentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComputablePolicyConsentOperations.validateComputablePolicyConsentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComputablePolicyConsentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComputablePolicyConsentOperations.validateComputablePolicyConsentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComputablePolicyConsentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComputablePolicyConsentOperations.validateComputablePolicyConsentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComputablePolicyConsentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComputablePolicyConsentOperations.validateComputablePolicyConsentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComputablePolicyConsentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComputablePolicyConsentOperations.validateComputablePolicyConsentValue(this, diagnostics, context);
	}
} //ComputablePolicyConsentImpl
