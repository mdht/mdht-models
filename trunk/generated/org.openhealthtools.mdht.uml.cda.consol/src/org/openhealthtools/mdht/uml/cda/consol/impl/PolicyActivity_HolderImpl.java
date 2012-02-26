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
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Holder;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity_HolderOperations;

import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_HolderImpl extends Participant2Impl implements PolicyActivity_Holder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_HolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHolderTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_HolderOperations.validateHolderTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHolderTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_HolderOperations.validateHolderTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHolderHolderRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_HolderOperations.validateHolderHolderRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHolderHolderRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_HolderOperations.validateHolderHolderRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHolderHolderRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_HolderOperations.validateHolderHolderRoleAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_Holder init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PolicyActivity_HolderImpl
