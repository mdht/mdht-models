/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;
import org.hl7.cbcc.privacy.consentdirective.operations.PrivacyConsentDirectiveDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Consent Directive Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyConsentDirectiveDocumentImpl extends ClinicalDocumentImpl
		implements PrivacyConsentDirectiveDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentDirectiveDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentSignaturesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentSignaturesSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentAuthenticator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentDocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentDocumentationOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentLegalAuthenticator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentCustodian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentRecordTarget(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDirectiveDocumentRelatedDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDirectiveDocumentOperations.validatePrivacyConsentDirectiveDocumentRelatedDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyConsentDetailsSection getPrivacyConsentDetailsSection() {
		return PrivacyConsentDirectiveDocumentOperations.getPrivacyConsentDetailsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturesSection getSignaturesSection() {
		return PrivacyConsentDirectiveDocumentOperations.getSignaturesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentDirectiveDocument init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentDirectiveDocument init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacyConsentDirectiveDocumentImpl
