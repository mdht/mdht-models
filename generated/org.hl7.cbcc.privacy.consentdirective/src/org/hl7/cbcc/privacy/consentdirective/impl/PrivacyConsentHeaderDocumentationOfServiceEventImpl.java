/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ServiceEventImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent;
import org.hl7.cbcc.privacy.consentdirective.operations.PrivacyConsentHeaderDocumentationOfServiceEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Consent Header Documentation Of Service Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyConsentHeaderDocumentationOfServiceEventImpl extends ServiceEventImpl
		implements PrivacyConsentHeaderDocumentationOfServiceEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentHeaderDocumentationOfServiceEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderDocumentationOfServiceEventOperations.validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderDocumentationOfServiceEventOperations.validatePrivacyConsentHeaderDocumentationOfServiceEventCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderDocumentationOfServiceEventOperations.validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderDocumentationOfServiceEvent init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderDocumentationOfServiceEvent init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacyConsentHeaderDocumentationOfServiceEventImpl
