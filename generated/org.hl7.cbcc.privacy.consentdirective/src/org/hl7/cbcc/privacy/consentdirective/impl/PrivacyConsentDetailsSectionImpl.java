/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection;
import org.hl7.cbcc.privacy.consentdirective.operations.PrivacyConsentDetailsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Consent Details Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyConsentDetailsSectionImpl extends SectionImpl implements PrivacyConsentDetailsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyConsentDetailsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.PRIVACY_CONSENT_DETAILS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDetailsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyConsentDetailsSectionOperations.validatePrivacyConsentDetailsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDetailsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyConsentDetailsSectionOperations.validatePrivacyConsentDetailsSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDetailsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyConsentDetailsSectionOperations.validatePrivacyConsentDetailsSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDetailsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyConsentDetailsSectionOperations.validatePrivacyConsentDetailsSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyConsentDetailsSectionEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyConsentDetailsSectionOperations.validatePrivacyConsentDetailsSectionEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentDetailsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyConsentDetailsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacyConsentDetailsSectionImpl
