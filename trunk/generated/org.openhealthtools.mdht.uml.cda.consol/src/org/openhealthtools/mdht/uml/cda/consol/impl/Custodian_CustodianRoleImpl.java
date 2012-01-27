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
import org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole;

import org.openhealthtools.mdht.uml.cda.consol.operations.Custodian_CustodianRoleOperations;

import org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custodian Custodian Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Custodian_CustodianRoleImpl extends ParticipantRoleImpl implements Custodian_CustodianRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Custodian_CustodianRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CUSTODIAN_CUSTODIAN_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Custodian_CustodianRoleOperations.validateCustodianRoleAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Custodian_CustodianRoleOperations.validateCustodianRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianRoleTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Custodian_CustodianRoleOperations.validateCustodianRoleTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianRolePlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Custodian_CustodianRoleOperations.validateCustodianRolePlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian_CustodianRole init() {
    	CDAUtil.init(this);
    	return this;
	}
} // Custodian_CustodianRoleImpl
