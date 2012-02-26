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
import org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Informant_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informant Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Informant_AssignedEntityImpl extends AssignedEntityImpl implements Informant_AssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Informant_AssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INFORMANT_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityHasNationalProviderIdentifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return Informant_AssignedEntityOperations.validateAssignedEntityHasNationalProviderIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant_AssignedEntityOperations.validateAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant_AssignedEntityOperations.validateAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant_AssignedEntityOperations.validateAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant_AssignedEntityOperations.validateAssignedEntityPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Informant_AssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} // Informant_AssignedEntityImpl
