/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;
import org.hl7.cbcc.privacy.consentdirective.operations.SignaturesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signatures Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SignaturesSectionImpl extends SectionImpl implements SignaturesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignaturesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.SIGNATURES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignaturesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignaturesSectionOperations.validateSignaturesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignaturesSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignaturesSectionOperations.validateSignaturesSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignaturesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignaturesSectionOperations.validateSignaturesSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignaturesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignaturesSectionOperations.validateSignaturesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignaturesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignaturesSectionOperations.validateSignaturesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignaturesSectionEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignaturesSectionOperations.validateSignaturesSectionEntry(this, diagnostics, context);
	}
} //SignaturesSectionImpl
