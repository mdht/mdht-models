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
import org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Payer_PayerAssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payer Payer Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Payer_PayerAssignedEntityImpl extends AssignedEntityImpl implements Payer_PayerAssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Payer_PayerAssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PAYER_PAYER_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Payer_PayerAssignedEntityOperations.validatePayerAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Payer_PayerAssignedEntityOperations.validatePayerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Payer_PayerAssignedEntityOperations.validatePayerAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Payer_PayerAssignedEntityOperations.validatePayerAssignedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Payer_PayerAssignedEntityOperations.validatePayerAssignedEntityPayerOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Payer_PayerAssignedEntityOperations.validatePayerAssignedEntityPayerOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payer_PayerAssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} //Payer_PayerAssignedEntityImpl
