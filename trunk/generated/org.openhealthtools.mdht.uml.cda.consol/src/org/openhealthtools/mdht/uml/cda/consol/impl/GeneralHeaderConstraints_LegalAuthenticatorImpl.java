/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_LegalAuthenticatorOperations;

import org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Header Constraints Legal Authenticator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_LegalAuthenticatorImpl extends LegalAuthenticatorImpl implements
		GeneralHeaderConstraints_LegalAuthenticator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_LegalAuthenticatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraints_LegalAuthenticatorOperations.validateLegalAuthenticatorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalAuthenticatorSignatureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraints_LegalAuthenticatorOperations.validateLegalAuthenticatorSignatureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_LegalAuthenticator init() {
    	CDAUtil.init(this);
    	return this;
	}
} // GeneralHeaderConstraints_LegalAuthenticatorImpl
