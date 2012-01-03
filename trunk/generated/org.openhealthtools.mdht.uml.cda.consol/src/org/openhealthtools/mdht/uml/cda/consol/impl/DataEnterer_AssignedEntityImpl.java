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
import org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.DataEnterer_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Enterer Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataEnterer_AssignedEntityImpl extends AssignedEntityImpl implements DataEnterer_AssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEnterer_AssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DATA_ENTERER_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityHasNationalProviderIdentifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DataEnterer_AssignedEntityOperations.validateAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DataEnterer_AssignedEntityOperations.validateAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DataEnterer_AssignedEntityOperations.validateAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DataEnterer_AssignedEntityOperations.validateAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DataEnterer_AssignedEntityOperations.validateAssignedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityAssignedPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DataEnterer_AssignedEntityOperations.validateAssignedEntityAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer_AssignedEntity init() {
		CDAUtil.init(this);
		return this;
	}
} // DataEnterer_AssignedEntityImpl
