/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.LegalAuthenticatorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Legal Authenticator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator#validateLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator#validateLegalAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Signature Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_LegalAuthenticatorOperations extends LegalAuthenticatorOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_LegalAuthenticatorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLegalAuthenticatorTime(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLegalAuthenticatorTime(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLegalAuthenticatorTime(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLegalAuthenticatorTime(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param generalHeaderConstraints_LegalAuthenticator The receiving '<em><b>General Header Constraints Legal Authenticator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLegalAuthenticatorTime(
			GeneralHeaderConstraints_LegalAuthenticator generalHeaderConstraints_LegalAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR);
			try {
				VALIDATE_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints_LegalAuthenticator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__LEGAL_AUTHENTICATOR_TIME,
					ConsolPlugin.INSTANCE.getString("LegalAuthenticatorTime"),
					new Object[] { generalHeaderConstraints_LegalAuthenticator }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLegalAuthenticatorSignatureCode(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Signature Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLegalAuthenticatorSignatureCode(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.signatureCode.oclIsUndefined() or self.signatureCode.isNullFlavorUndefined()) implies (not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in (" + "value.code = 'S'))";

	/**
	 * The cached OCL invariant for the '{@link #validateLegalAuthenticatorSignatureCode(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Signature Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLegalAuthenticatorSignatureCode(GeneralHeaderConstraints_LegalAuthenticator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.signatureCode.oclIsUndefined() or self.signatureCode.isNullFlavorUndefined()) implies (not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in (
	 * value.code = 'S'))
	 * @param generalHeaderConstraints_LegalAuthenticator The receiving '<em><b>General Header Constraints Legal Authenticator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLegalAuthenticatorSignatureCode(
			GeneralHeaderConstraints_LegalAuthenticator generalHeaderConstraints_LegalAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR);
			try {
				VALIDATE_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints_LegalAuthenticator)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__LEGAL_AUTHENTICATOR_SIGNATURE_CODE,
					ConsolPlugin.INSTANCE.getString("LegalAuthenticatorSignatureCode"),
					new Object[] { generalHeaderConstraints_LegalAuthenticator }));
			}
			return false;
		}
		return true;
	}

} // GeneralHeaderConstraints_LegalAuthenticatorOperations
