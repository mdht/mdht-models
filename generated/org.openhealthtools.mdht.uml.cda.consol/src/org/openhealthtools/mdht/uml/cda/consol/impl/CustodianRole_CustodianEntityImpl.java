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
import org.openhealthtools.mdht.uml.cda.consol.CustodianRole_CustodianEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.CustodianRole_CustodianEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custodian Role Custodian Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CustodianRole_CustodianEntityImpl extends PlayingEntityImpl implements CustodianRole_CustodianEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustodianRole_CustodianEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CUSTODIAN_ROLE_CUSTODIAN_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianEntityName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CustodianRole_CustodianEntityOperations.validateCustodianEntityName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustodianRole_CustodianEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} // CustodianRole_CustodianEntityImpl
