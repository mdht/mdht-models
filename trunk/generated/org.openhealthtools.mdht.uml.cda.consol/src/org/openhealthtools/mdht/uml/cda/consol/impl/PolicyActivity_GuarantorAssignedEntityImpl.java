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
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_GuarantorAssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity_GuarantorAssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity Guarantor Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_GuarantorAssignedEntityImpl extends AssignedEntityImpl implements PolicyActivity_GuarantorAssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_GuarantorAssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_GUARANTOR_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_GuarantorAssignedEntityOperations.validateGuarantorAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_GuarantorAssignedEntityOperations.validateGuarantorAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_GuarantorAssignedEntityOperations.validateGuarantorAssignedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_GuarantorAssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PolicyActivity_GuarantorAssignedEntityImpl
