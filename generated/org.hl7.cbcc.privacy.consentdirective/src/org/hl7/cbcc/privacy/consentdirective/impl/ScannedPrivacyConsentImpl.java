/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.ObservationMediaImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent;
import org.hl7.cbcc.privacy.consentdirective.operations.ScannedPrivacyConsentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanned Privacy Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScannedPrivacyConsentImpl extends ObservationMediaImpl implements ScannedPrivacyConsent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScannedPrivacyConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.SCANNED_PRIVACY_CONSENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateScannedPrivacyConsentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedPrivacyConsentOperations.validateScannedPrivacyConsentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateScannedPrivacyConsentMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedPrivacyConsentOperations.validateScannedPrivacyConsentMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateScannedPrivacyConsentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedPrivacyConsentOperations.validateScannedPrivacyConsentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateScannedPrivacyConsentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedPrivacyConsentOperations.validateScannedPrivacyConsentValue(this, diagnostics, context);
	}
} //ScannedPrivacyConsentImpl
