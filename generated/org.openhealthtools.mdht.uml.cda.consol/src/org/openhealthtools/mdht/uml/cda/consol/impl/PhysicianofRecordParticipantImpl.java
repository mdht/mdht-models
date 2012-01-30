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
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipantOperations;

import org.openhealthtools.mdht.uml.cda.impl.EncounterParticipantImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physicianof Record Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicianofRecordParticipantImpl extends EncounterParticipantImpl implements PhysicianofRecordParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianofRecordParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicianofRecordParticipantTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicianofRecordParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicianofRecordParticipantAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant init() {
		CDAUtil.init(this);
		return this;
	}
} // PhysicianofRecordParticipantImpl
