/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Header Constraints Legal Authenticator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getGeneralHeaderConstraints_LegalAuthenticator()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='LegalAuthenticatorTime LegalAuthenticatorSignatureCode' signatureCode.code='S'"
 * @generated
 */
public interface GeneralHeaderConstraints_LegalAuthenticator extends LegalAuthenticator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateLegalAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.signatureCode.oclIsUndefined() or self.signatureCode.isNullFlavorUndefined()) implies (not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in (
	 * value.code = 'S'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.signatureCode.oclIsUndefined() or self.signatureCode.isNullFlavorUndefined()) implies (not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in (\nvalue.code = \'S\'))'"
	 * @generated
	 */
	boolean validateLegalAuthenticatorSignatureCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_LegalAuthenticator init();
} // GeneralHeaderConstraints_LegalAuthenticator
