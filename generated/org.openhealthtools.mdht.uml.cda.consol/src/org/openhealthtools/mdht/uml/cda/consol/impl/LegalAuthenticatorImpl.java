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
import org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator;

import org.openhealthtools.mdht.uml.cda.consol.operations.LegalAuthenticatorOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Authenticator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LegalAuthenticatorImpl extends org.openhealthtools.mdht.uml.cda.impl.LegalAuthenticatorImpl implements
		LegalAuthenticator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalAuthenticatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.LEGAL_AUTHENTICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolLegalAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LegalAuthenticatorOperations.validateConsolLegalAuthenticatorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator init() {
		CDAUtil.init(this);
		return this;
	}
} // LegalAuthenticatorImpl
