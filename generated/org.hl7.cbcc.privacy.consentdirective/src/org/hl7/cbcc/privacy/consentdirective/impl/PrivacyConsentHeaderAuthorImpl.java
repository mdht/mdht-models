/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.AuthorImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor;
import org.hl7.cbcc.privacy.consentdirective.operations.PrivacyConsentHeaderAuthorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Consent Header Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyConsentHeaderAuthorImpl extends AuthorImpl implements PrivacyConsentHeaderAuthor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentHeaderAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_HEADER_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderAuthorTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderAuthorOperations.validatePrivacyConsentHeaderAuthorTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderAuthorFunctionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderAuthorOperations.validatePrivacyConsentHeaderAuthorFunctionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderAuthorFunctionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderAuthorOperations.validatePrivacyConsentHeaderAuthorFunctionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyConsentHeaderAuthorOperations.validatePrivacyConsentHeaderAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentHeaderAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentHeaderAuthorOperations.validatePrivacyConsentHeaderAuthorAssignedAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderAuthor init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentHeaderAuthor init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacyConsentHeaderAuthorImpl
