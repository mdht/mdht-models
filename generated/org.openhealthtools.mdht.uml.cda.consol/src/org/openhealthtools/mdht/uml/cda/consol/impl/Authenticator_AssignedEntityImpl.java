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

import org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.Authenticator_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authenticator Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Authenticator_AssignedEntityImpl extends AssignedEntityImpl implements Authenticator_AssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Authenticator_AssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.AUTHENTICATOR_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityHasNationalProviderIdentifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return Authenticator_AssignedEntityOperations.validateAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Authenticator_AssignedEntityOperations.validateAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Authenticator_AssignedEntityOperations.validateAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Authenticator_AssignedEntityOperations.validateAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Authenticator_AssignedEntityOperations.validateAssignedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator_AssignedEntity init() {
		CDAUtil.init(this);
		return this;
	}
} // Authenticator_AssignedEntityImpl
