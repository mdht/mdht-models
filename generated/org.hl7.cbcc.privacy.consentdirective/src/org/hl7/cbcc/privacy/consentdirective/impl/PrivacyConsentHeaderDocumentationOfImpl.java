/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.DocumentationOfImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf;
import org.hl7.cbcc.privacy.consentdirective.operations.PrivacyConsentHeaderDocumentationOfOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Consent Header Documentation Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyConsentHeaderDocumentationOfImpl extends DocumentationOfImpl
		implements PrivacyConsentHeaderDocumentationOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentHeaderDocumentationOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderDocumentationOfTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderDocumentationOfOperations.validatePrivacyConsentHeaderDocumentationOfTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderDocumentationOfOperations.validatePrivacyConsentHeaderDocumentationOfServiceEvent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderDocumentationOf init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderDocumentationOf init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacyConsentHeaderDocumentationOfImpl
