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
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_PayerAssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity_PayerAssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity Payer Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_PayerAssignedEntityImpl extends AssignedEntityImpl implements PolicyActivity_PayerAssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_PayerAssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_PAYER_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerAssignedEntityOperations.validatePayerAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerAssignedEntityOperations.validatePayerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerAssignedEntityOperations.validatePayerAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerAssignedEntityOperations.validatePayerAssignedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityRepresentedOrganization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerAssignedEntityOperations.validatePayerAssignedEntityRepresentedOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_PayerAssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PolicyActivity_PayerAssignedEntityImpl
