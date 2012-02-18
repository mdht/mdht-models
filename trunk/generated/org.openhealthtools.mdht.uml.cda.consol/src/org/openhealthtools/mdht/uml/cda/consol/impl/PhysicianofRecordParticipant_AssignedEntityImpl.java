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
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipant_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physicianof Record Participant Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicianofRecordParticipant_AssignedEntityImpl extends AssignedEntityImpl implements
		PhysicianofRecordParticipant_AssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianofRecordParticipant_AssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianofRecordParticipant_AssignedEntityOperations.validateAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianofRecordParticipant_AssignedEntityOperations.validateAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant_AssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} // PhysicianofRecordParticipant_AssignedEntityImpl
