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
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Payer;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity_PayerOperations;

import org.openhealthtools.mdht.uml.cda.impl.Performer2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity Payer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_PayerImpl extends Performer2Impl implements PolicyActivity_Payer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_PayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_PAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerPayerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerPayerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerPayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerPayerAssignedEntityPayerOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerPayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerPayerAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerPayerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerPayerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerPayerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerPayerAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerPayerAssignedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerPayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivity_PayerOperations.validatePayerPayerAssignedEntityPayerOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_Payer init() {
		CDAUtil.init(this);
		return this;
	}
} // PolicyActivity_PayerImpl
