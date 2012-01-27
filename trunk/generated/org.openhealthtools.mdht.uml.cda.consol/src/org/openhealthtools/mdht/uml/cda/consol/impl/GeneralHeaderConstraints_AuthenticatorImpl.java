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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Authenticator;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_AuthenticatorOperations;

import org.openhealthtools.mdht.uml.cda.impl.AuthenticatorImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Header Constraints Authenticator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_AuthenticatorImpl extends AuthenticatorImpl implements
		GeneralHeaderConstraints_Authenticator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_AuthenticatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraints_AuthenticatorOperations.validateAuthenticatorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticatorSignatureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraints_AuthenticatorOperations.validateAuthenticatorSignatureCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticatorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraints_AuthenticatorOperations.validateAuthenticatorAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_Authenticator init() {
		CDAUtil.init(this);
		return this;
	}
} // GeneralHeaderConstraints_AuthenticatorImpl
